var member = member || {}
member = (function(){
	let _, session
	let init = function(){
		 _ = sessionStorage.getItem('context'),
		 session = sessionStorage.getItem('session')
	}
	let join = function(payload){
		$.ajax({
			url : _+`/members/join`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				location.href = _+`/location/member/LoginForm`
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let login = function(payload){
		$.ajax({
			url : _+`/members/${payload.memberId}`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert(res)
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let logout = function(){
		sessionStroage.removeItem('memberid')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('img')
	}
	return {init, join, login, logout}
})()