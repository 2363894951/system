layui.use('table', function () {
    var table = layui.table;
    //数据表格实例化
    var layTableId = "latTable";

    var tableIns = table.render({
        elem: '#demo'
        , url: '/department/getDepartmentData' //数据接口
        , cols: [[ //表头,toolbar: '#toolbarDemo'
            {field: 'id', title: 'ID', sort: true, fixed: 'left', align: 'center',hide:'true'}
            , {field: 'department', title: '部门',align: 'center'}
            , {field: 'action', align: 'center', title: "操作", toolbar: '#barDemo',align: 'center'}
        ]]
    });

    //监听工具条
    table.on('tool(test)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data;             //获得当前行数据
        var layEvent = obj.event;        //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr;                 //获得当前行 tr 的DOM对象
        if (layEvent === 'del') { //删除
            layer.confirm('真的删除行么', function (index) {
                $.ajax({
                    url: "/department/deleteDepartment",
                    data: {id: data.id},
                    dataType: "json",
                    success: function (isSuccess) {
                        if (isSuccess) {
                            layer.msg("删除成功", {icon: 6});
                            obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                        } else {
                            layer.msg("删除失败", {icon: 5});
                        }
                    }
                    , erro: function () {
                        layer.msg("删除失败,请联系管理员", {icon: 5});
                    }
                });
                layer.close(index);
                //向服务端发送删除指令
            });
        } else if (layEvent === 'edit') { //编辑
            //do something
            //同步更新缓存对应的值

            layer.prompt({
                formType: 2
                , value: data.department
            }, function (value, index) {
                $.ajax({
                    url: "/department/updateDepartment",
                    data: {id: data.id, department: value},
                    dataType: "json",
                    success: function (msg) {
                        if (msg) {
                            layer.msg("修改成功", {icon: 1});
                        } else {
                            layer.msg("修改失败", {icon: 5});
                        }
                    }
                });
                obj.update({
                    department: value
                });
                layer.close(index);
            });
        }
        // else if(layEvent === 'add'){
        //   lay.msg("11");
        // }
    });
    $("#add").on("click", function () {
        layer.prompt({
            formType: 2,
            title: '请输入部门名称',
            area: ['500px', '200px'] //自定义文本域宽高
        }, function (value, index, elem) {
            $.ajax({
                url: "/department/addDepartment",
                data: {department: value},
                dataType: "text",
                success: function (msg) {
                    switch (msg) {
                        case "success":
                            layer.msg("添加成功", {icon: 1});
                            tableIns.reload();
                            break;
                        case "repeat":
                            layer.msg("该部门已存在", {icon: 5});
                            break;
                        case null:
                            layer.msg("名称不能为空");
                            break;
                    }
                }
                , erro: function () {
                    layer.msg("添加失败,请联系管理员", {icon: 5});
                }
            });
            layer.close(index);
        });
    })

});