var TwoFer = function () {};

TwoFer.prototype.twoFer = function (who) {
    if(who == null) {
      who= 'One for you, one for me.';
    }
    if (who == 'Alice') {
      who= 'One for Alice, one for me.';
    }
    if (who == 'Bob') {
      who= 'One for Bob, one for me.';
    }

  return who;
};

module.exports = TwoFer;
