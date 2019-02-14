/* var express = require('express');
var app = express();
app.get('/year/age=:age', function (req, res) {
    var age=req.params.age;
var year=2018-age;
    res.send("helllo"+year);
 }).listen(3002); */



 var express = require('express');
var app = express();
app.get('/year/', function (req, res) {
    var age=req.query.age;
var year=2018-age;
    res.send("helllo"+year);
 }).listen(3002);


 /* http://localhost:3002/year?age=3 */