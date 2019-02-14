var express = require('express');
var app = express();
app.get('/', function (req, res) {
    res.send("helllo" );
 }).listen(3001);