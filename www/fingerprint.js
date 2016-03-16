module.exports = {
  test: function(success, error){
    cordova.exec(success, error, "Fingerprint", "test", ["hardcodedteststring"]);
  }
};
