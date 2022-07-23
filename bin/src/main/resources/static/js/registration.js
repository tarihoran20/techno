function validate() {
	//username
	var username = document.getElementById('username')
	var vUsername1 = document.getElementById('valUser1')
	var allow = /^[a-zA-Z0-9_]+$/
	var vUsername2 = document.getElementById('valUser2')

	if (username.value == "") {
		vUsername1.style.display = 'block'
		vUsername2.style.display = 'none'
	}
	else if (!username.value.match(allow) || username.value == " " )
	{
		vUsername1.style.display = 'none'
		vUsername2.style.display = 'block'
	} 
	else {
		vUsername1.style.display = 'none'
		vUsername2.style.display = 'none'
	}
	
	//password
	var password = document.getElementById('password')
	var alPass = document.getElementById('alertPass')
	var alPass2 = document.getElementById('alertPass2')
	
	if(password.value == "")
	{
		alPass.style.display = 'block'
		alPass2.style.display = 'none'
	}
	else if(password.value.length < 6)
	{
		alPass.style.display = 'none'
		alPass2.style.display = 'block'
	}
	else
	{
		alPass.style.display = 'none'
		alPass2.style.display = 'none'
	}
	
	//repeat password
	var repPassword = document.getElementById('repPassword')
	var alRepPass = document.getElementById('alertRepPass')
	
	if(password.value != repPassword.value || repPassword.value == "")
	{
		alRepPass.style.display = 'block'
	}
	else
	{
		alRepPass.style.display = 'none'
	}
	
	//nama identitas
	var namaIdentitas = document.getElementById('namaIdentitas')
	var alNamaIdentitas = document.getElementById('alertNamaIdentitas')
	var allowWord = /^[A-Z][a-z]*(?: [A-Z][a-z]*)*$/
	
	if(namaIdentitas.value == "" || namaIdentitas.value.match(allowWord))
	{
		alNamaIdentitas.style.display = 'block'
	}
	else 
	{
		alNamaIdentitas.style.display = 'none'
	}

	
}