const express=require("express");
const app=express();
const bodyParser=require("body-parser");
 app.use(bodyParser.json()); 

const mongoose=require("mongoose");
require("./Books1")
const Book=mongoose.model("Books");
mongoose.connect("mongodb://akkamma:mallika123@ds231205.mlab.com:31205/bookdatabase", ()=> {
    console.log("connted database");
});

/* mongoose.connect("mongodb://localhost/bookservice", ()=> {
    console.log("connted database");
}); */

 
/* app.get("/",(req,res)=>{
    console.log("hello")
    res.send("hello mallika welcome");
}) */
app.post("/",(req,res)=>{
    console.log(req.body);
    var newBook={
        
        title: req.body.title,
        auhthor: req.body.auhthor,
        numberages: req.body.numberages,
        publisher: req.body.publisher
    }
    var book=new Book(newBook)
    book.save().then(()=>{
        console.log("New book created")
    })
res.send(req.newBook);
})

app.listen(9999,()=>{
    console.log("server is running ")
});