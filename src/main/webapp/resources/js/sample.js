var dataService = (function(){
	
	var url="http://192.168.0.27:8080/data/";
	
	function list(page, callback){
		
		$.getJSON(url + "list?page=" + page, callback);
		
	}
	
	function add(obj, callback) {
		console.log("add " + url)
		
		$.ajax({
			   type: "POST",
			   url: url+"new",
			   data: JSON.stringify(obj),
			   contentType : "application/json; charset=utf-8",
			   success: callback
			});
		
	}
	
	return { add: add , list: list }
	
})();