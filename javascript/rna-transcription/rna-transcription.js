var Rna = function(){
};

Rna.prototype.toRna = function(value){
  var dnaArray = value.toString().split("");

  dnaArray.forEach(function(element, index, array){
    switch (element) {
      case "G":
        dnaArray[index] = "C";
        break;
      case "C":
        dnaArray[index] = "G";
        break;
      case "T":
        dnaArray[index] = "A";
        break;
      case "A":
        dnaArray[index] = "U";
        break;
      default:
        throw new Error("Invalid input");
    }
  });

  return dnaArray.join("");
}

module.exports = Rna;
