var express = require("express");
var app = express();
var routes = require('./Routes/employee.routes');
var bodyParser = require('body-parser');
var port = 5000;
app.use(bodyParser.json());
app.use('/users',routes);
app.listen(port,()=>{
    console.log(`server is running on the port ${port}`);
})

module.exports = app;




