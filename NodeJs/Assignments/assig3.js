/* const fs=require('fs');
fs.readdir('./',function(err,item){


    if(err)
return console.log(err);
for(i=0;i<item.length;i++){
    console.log(item[i]);
}
}); */

const fs=require('fs')
fs.readdir('./',(err,item)=>{
  item.forEach(file=>{
      console.log(file)
  });
});