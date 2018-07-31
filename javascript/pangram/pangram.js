var Pangram = function(input) {
  this.value = input;
};

Pangram.prototype.isPangram = function () {
  var pangramSentence = this.value.toString().toUpperCase().split("");
  var alphabet = "abcdefghijklmnopqrstuvwxyz";
  var arrayAlphabet = alphabet.toUpperCase().split("");
  var isPangram = true;


   if   (0 === this.value.length) {
     isPangram = false;
   } else {
     arrayAlphabet.forEach(function(element){
       isPangram = isPangram && pangramSentence.includes(element);
     });
   }

   return isPangram;
}


module.exports = Pangram;
