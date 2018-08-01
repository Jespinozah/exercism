var reverseString = function (input) {
  this.value = input;
  var response;

  if   (0 === this.value.length) {
    response = '';
  } else {
    var temp = '';
    var valueArray = this.value.toString().split("");
    for (i = valueArray.length -1; i >= 0; i--) {
      temp = temp + valueArray[i];
      response = temp;
    }
  }

  return response;
};

module.exports = reverseString;
