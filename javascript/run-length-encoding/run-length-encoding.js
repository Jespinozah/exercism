var RLE={};
RLE.encode=function (plain){
  let count=1;
  let encoder='';
  for (let i=0;i<plain.length;i++){
    if (plain[i]===plain[i+1]){
      count++;
    }else {
      if (count>1){
        encoder+=count;
      }
      encoder+=plain[i];
      count=1;
    }
  }
  return encoder;
};
RLE.decode=function(encoder){
  let reg=/(\d*)([A-Za-z\s])/g;
  let r;
  let plain='';
  while (r=reg.exec(encoder)){
    let count=r[1]?r[1]:1;
    for (let i=0;i<count;i++){
      plain+=r[2];
    }
  }
  return plain;
};

module.exports=RLE;
