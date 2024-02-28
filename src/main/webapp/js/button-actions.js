$(function() {

    $('#clearBtn').on('click', function() {
        $('#regForm').get(0).reset()
    })

    $('#regBtn').on('click', function() {
        location.replace("insert.jsp");
    })

    $('#returnBtn').on('click', function() {
        location.replace("index.jsp");
    })
})
