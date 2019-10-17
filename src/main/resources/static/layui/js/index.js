//JavaScript代码区域
layui.use(['element', 'layer'], function () {
    var element = layui.element
        , layer = layui.layer
        ,$=layui.jquery;

    //所有导航数据
    var navs = [{
        name: "personnel", object: [
            {
                name: "setDepartment",
                title: "部门设置",
                icon: "&#xe67b;",
                src: "/department/getDepartmentJSP"
            },
            {
                name: "dutyManage",
                title: "职务管理",
                icon: "&#xe67b;",
                src: "/duty/getDutyJSP"
            }, {
                name: "personnelManage",
                title: "人事管理",
                icon: "&#xe67b;",
                src: "/student/showStudent"
            }]
    }, {
        name: "attendance", object: [
            /*{
                name: "adAdd",
                title: "考勤录入",
                icon: "&#xe67b;",
                src: "/Cor/Attendance/Insert2"
            },*/
            {
                name: "adQuery",
                title: "考勤查询",
                icon: "&#xe67b;",
                src: "/Cor/Attendance/Query"
            }, {
                name: "adStat",
                title: "考勤统计",
                icon: "&#xe67b;",
                src: "/Cor/Attendance/Statistics;"
            },
            {
                name: "myAd",
                title: "我的考勤记录",
                icon: "&#xe67b;",
                src: "/Cor/Attendance/date;"
            }]
    }, {
        name: "discipline", object: [
            /* {
                 name: "disAdd",
                 title: "违纪录入",
                 icon: "&#xe67b;",
                 src: "/Cor/disciplineRecord/getAddJsp"
             },*/
            {
                name: "disQuery",
                title: "违纪记录",
                icon: "&#xe67b;",
                src: "/Cor/disciplineRecord/getListJsp"
            }, {
                name: "myDis",
                title: "我的违纪记录",
                icon: "&#xe67b;",
                src: "/Cor/disciplineRecord/getMyJsp"
            },
            {
                name: "disItem",
                title: "违纪项管理",
                icon: "&#xe67b;",
                src: "/Cor/disciplineItem/getListJsp"
            }]
    },
        {
            name: "homework", object: [
                {
                    name: "hwRel",
                    title: "作业发布",
                    icon: "&#xe67b;",
                    src: "/Cor/hwRel/list"
                },
                {
                    name: "hwSub",
                    title: "作业提交",
                    icon: "&#xe67b;",
                    src: "/Cor/hwSub/show"
                }
                ,
                {
                    name: "myHwReocord",
                    title: "我的提交记录",
                    icon: "&#xe67b;",
                    src: "/Cor/myHrd/show"
                }, {
                    name: "hwRecord",
                    title: "作业记录",
                    icon: "&#xe67b;",
                    src: "/Cor/hwRcd/list"
                },
                {
                    name: "hwItem",
                    title: "作业项设置",
                    icon: "&#xe67b;",
                    src: "/Cor/hwType/list"
                }]
        }, {
            name: "classFee", object: [
                {
                    name: "monthFee",
                    title: "月费记录",
                    icon: "&#xe67b;",
                    src: "/Cor/mf/show"
                }, {
                    name: "penalty",
                    title: "罚款记录",
                    icon: "&#xe67b;",
                    src: "/Cor/penalty/show"
                }, {
                    name: "classfeeDetail",
                    title: "班费明细",
                    icon: "&#xe67b;",
                    src: "/Cor/cfd/show"
                }/*, {
                    name: "classfeeRecord",
                    title: "班费记录",
                    icon: "&#xe67b;",
                    src: "javascript:;"
                }*/]
        }, {
            /*name: "system", object: [
                {
                    name: "userManage",
                    title: "用户管理",
                    icon: "&#xe67b;",
                    src: "javascript:;"
                },
                {
                    name: "roleManage",
                    title: "角色管理",
                    icon: "&#xe67b;",
                    src: "javascript:;"
                }]*/
        }];

    $("#header-nav").find("li").on("click", function () {
        for (var i = 0; i < navs.length; i++) {
            if ($(this).attr("data-name") == navs[i].name) {
                generateNav(navs[i].object);
                var sideNav = navs[i].object;
                $("#left-nav").children("li").on("click", function () {
                    for (var k = 0; k < sideNav.length; k++) {
                        if ($(this).attr("data-name") == sideNav[k].name) {
                            addTab(sideNav[k]);
                        }
                    }
                    element.init();
                });
            }
        }
    })

    element.on('tab(main)', function (data) {
        refresh()
    });

    $("#refreshThis").on("click", function () {
        $("#pageOpt").attr("lay-shrink", "all");
        refresh();
    })

    $("#closePageOther").on("click", function () {
        closeTab($(".layui-tab-title").children("li").not(".layui-this"));
    })

    $("#closePageAll").on("click", function () {
        closeTab($(".layui-tab-title").children("li"));
    })

    /* 以下为封装函数 */

    // 刷新当前
    function refresh() {
        var src = $(".layui-tab-item.layui-show").find("iframe").attr("src");
        $(".layui-tab-item.layui-show").find("iframe").attr("src", src);
    }

    // 关闭标签页
    function closeTab(dom) {
        console.log("length:" + dom.length);
        if (dom.length == 1) {
            layer.msg("暂无可关闭页面")
        } else {
            dom.each(function (i, e) {
                console.log($(this).attr("lay-id"));
                element.tabDelete('main', $(this).attr("lay-id"));
            });
        }
    }

    // 导航单击生成标签页
    function addTab(sideNav) {
        if ($("[lay-id|='" + sideNav.name + "']").length > 0) {
            element.tabChange('main', sideNav.name);

        } else {
            $(".layui-tab-title").children("li").removeClass("layui-this").end().append("<li class='layui-this' lay-id='" + sideNav.name + "'><i class='layui-icon'>" + sideNav.icon + sideNav.title + "</i></li>");
            $(".layui-tab-content").children("div").removeClass("layui-show").end().append("<div class='layui-tab-item layui-show'><iframe name='frame' src='" + sideNav.src + "' frameborder='0' class='layadmin-iframe' style='width: 100%;height: 100%;'></iframe></div>");
        }
    };

    // 生成导航
    function generateNav(navs) {
        var navDom;
        for (var i = 0; i < navs.length; i++) {
            navDom += "<li class='layui-nav-item' data-name='" + navs[i].name + "' id='" + navs[i].name + "'><a href='javascript:;'> <i class='layui-icon'>" + navs[i].icon + "</i> " + navs[i].title + "</a></li>";
        }
        $("#left-nav").children().not(":first").remove();
        $("#left-nav").append(navDom);
    }

});