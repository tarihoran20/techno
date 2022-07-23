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
	else if (!username.value.match(allow) || username.value == " ") {
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

	if (password.value == "") {
		alPass.style.display = 'block'
		alPass2.style.display = 'none'
	}
	else if (password.value.length < 6) {
		alPass.style.display = 'none'
		alPass2.style.display = 'block'
	}
	else {
		alPass.style.display = 'none'
		alPass2.style.display = 'none'
	}

	//repeat password
	var repPassword = document.getElementById('repPassword')
	var alRepPass = document.getElementById('alertRepPass')

	if (password.value != repPassword.value || repPassword.value == "") {
		alRepPass.style.display = 'block'
	}
	else {
		alRepPass.style.display = 'none'
	}

	//nama identitas
	var namaIdentitas = document.getElementById('namaIdentitas')
	var alNamaIdentitas = document.getElementById('alertNamaIdentitas')
	var allowWord = /^[A-Z][a-z]*(?: [A-Z][a-z]*)*$/

	if (namaIdentitas.value == "" || namaIdentitas.value.match(allowWord)) {
		alNamaIdentitas.style.display = 'block'
	}
	else {
		alNamaIdentitas.style.display = 'none'
	}


	//nama ijazah
	var namaIjazah = document.getElementById('namaIjazah')
	var alNamaIjazah = document.getElementById('alertNamaIjazah')
	
	if (namaIjazah.value == "") {
		alNamaIjazah.style.display = 'block'
	}
	else {
		alNamaIjazah.style.display = 'none'
	}
	
	//jenis identitas
	var jenisIdentitas = document.getElementById('jenisIdentitas')
	var alJenisIdentitas = document.getElementById('alertJenisIdentitas')
	
	if (jenisIdentitas.value == "") {
		alJenisIdentitas.style.display = 'block'
	}
	else {
		alJenisIdentitas.style.display = 'none'
	}
	
	//nomor identitas
	var noIdentitas = document.getElementById('noIdentitas')
	var alNoIdentitas = document.getElementById('alertNoIdentitas')
	
	if (noIdentitas.value == "") {
		alNoIdentitas.style.display = 'block'
	}
	else {
		alNoIdentitas.style.display = 'none'
	}
	
	//kewarganegaraan
	var kewarganegaraan = document.getElementById('kewarganegaraan')
	var alKewarganegaraan = document.getElementById('alertKewarganegaraan')
	
	if (kewarganegaraan.value == "") {
		alKewarganegaraan.style.display = 'block'
	}
	else {
		alKewarganegaraan.style.display = 'none'
	}



}