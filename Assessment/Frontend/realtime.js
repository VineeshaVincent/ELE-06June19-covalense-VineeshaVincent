function compile() {
    // link the html id to variable using document.getElementById()
    var html = document.getElementById("html");
    // seting the iframe id’s contentWindow to a variable
    var code = document.getElementById("code").contentWindow.document;
//  write a function that runs on document.body.keyup (when a key is pressed) that: - opens the textarea’s contentWindow -can write the corresponding codes in it
    document.body.onkeyup = function() {
      code.open();
      code.writeln(
        html.value 
      );
    //   closes the textarea’s contentWindow
      code.close();
    };
  }
  //function that uses to make the app functional
  compile();