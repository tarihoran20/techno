
var myHobby = {
		hoby: "football",
		func: function() {
			var self = this;
			document.write("outer: " + this.hoby + "<br />");
			document.write("outer: " + self.hoby + "<br />");
				(function() {
					document.write("inner: " + this.hoby + "<br />")
					document.write("inner: " + self.hoby + "<br />")
				}());
		}
	};
console.log(myHobby.func());