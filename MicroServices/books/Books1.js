const mongoose=require("mongoose");
mongoose.model("Books",{
title:{
    type:String,
    require:true
},
auhthor:{
    type:String,
    require:true
},
numberages:{
    type:Number,
    require:false
},
publisher:{
    type:String,
    require:false

}

});