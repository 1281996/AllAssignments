const express=require("express");
const app=express();
app.listen(4444,()=>{
    console.log("server is running ")
});

app.get("/",(req,res)=>{
    console.log("hello")
    res.send("hello mallika welcome");
})