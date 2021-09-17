var express=require('express');
var app=express();
var restRouter=require('./routes/rest.js');
var redirectRouter=require('./routes/redirect.js');
var indexRouter=require('./routes/index.js');
var path=require('path');

// app.get('/favicon.ico',sendFile("favicon.ico",{root:path.join(__dirname,'/public/views/')}));
app.use('/public',express.static(__dirname+'/public'));

app.use('/api/v1',restRouter);
app.use('/',indexRouter);
app.use('/:shortUrl',redirectRouter);

app.listen(3000);