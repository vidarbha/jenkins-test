var express = require('express');
var app = express();
var path = require('path');


app.set('views', __dirname + '/views');
app.set('view engine', 'jade');
app.use(express.static(__dirname + "/public"));


app.get('/', function(req, res) {
	console.log(__dirname);

	 return res.status(200).render('index', {userName: 'userName'});
});


console.log('Listening: ', 8080);
app.listen(8080);