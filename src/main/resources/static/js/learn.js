

//DOM

document.getElementById('header1').innerHTML = '<p> Halo Dunia</p>'

let a1 = 9
let a2 = '9'
document.write("<br> a1 = 9 <br> a2 = '9' ")
document.write('<br> Operator === ')
document.write(a1 === a2)

document.write('<br> Operator == ')
document.write(a1 == a2)

var myHobby = {
	hoby: "football",
	func: function() {
		var self = this;
		document.write("outer: " + this.hoby + "<br />")
		document.write("outer: " + self.hoby + "<br />")
			(function() {
				document.write("inner: " + this.hoby + "<br />")
				document.write("inner: " + self.hoby + "<br />")
			})
	}
}


//END DOM

var data = 900
data = 9
var data = "hallo"
data = 8
console.log("var dtype: " + data)

let data1 = 9000;
data1 = 300;

console.log("let change: " + data1)


const data3 = 700;
//data3 = 10;

//console.log("const change: " + data3)

function alertFunc() {
	alert("Halo")
}

function biodata(name, age, address) {
	//name: 'Agus'
	//age: 29
	//address: 'Bantul'
	console.log(name + ' ' + age + ' ' + address)
}

biodata('Jijo', 24, 'Bandung')

function numb() {
	return 'Dua'
}

function numbL() {
	return 5;
}

function sliceFunc() {
	var buah = ["mangga", "jeruk", "apel", "manggis", "semangka"]
	console.log(buah)
	console.log('slice ke 1= ' + buah.slice(1))
	buah.push("durian")
	console.log('slice 2-6= ' + buah.slice(2, 6))
}

function spliceFunc() {
	var buah = ["mangga", "jeruk", "apel", "manggis", "semangka"]
	buah.push("durian", "anggur", "nangka")
	console.log(buah)
	console.log('splice ke 1,2= ' + buah.splice(1, 2, "pisang", "duku", "kecapi"))

	console.log('splice 1,5= ' + buah.splice(1, 5))
	console.log(buah)
}

function filterArr() {
	var buah = ["mangga", "jeruk", "apel"]
	buah.push("semangka", "durian", "mangga", 1,)
	var dataFil = "mangga"

	console.log(buah.filter(item =>
		dataFil.includes(item))
	)
}

function forEachFunc() {
	var angka = [2, 4, 12, 8]

	angka.forEach(item => {
		console.log(item * item)
	})
}

function objLiteral() {
	var biodata1 = {
		nama: "Bimo",
		class: "7A",
		age: 17
	}

	console.log('Menggunakan For in: ')
	for (item in biodata1) {
		console.log(biodata1[item])
	}
}

function hobby() {
	var myHobby = {
		hoby: "football",
		func: function() {
			var self = this;
			document.write("outer: " + this.hoby + "<br />");
			document.write("outer: " + self.hoby + "<br />");
			(function() {
				document.write("inner: " + this.hoby + "<br />");
				document.write("inner: " + self.hoby + "<br />");
			}());
		}
	};
	myHobby.func();
}

function tokoBuku() {
	var data = {
		judul: "Spring in Action",
		harga: 360979,
		penulis: "Craig Walls"
	}

	for (item in data) {
		console.log(data[item])
	}
}

function quiz3no1() {

	console.log("'900'")
	var data = isNaN("900")
	console.log(data)

	console.log('100.9')
	var data1 = isNaN(100.9)
	console.log(data1)

	console.log('200')
	var data2 = isNaN(200)
	console.log(data2)

	console.log('"False"')
	var data2 = isNaN("False")
	console.log(data2)
}

function awesome() {
	var q = 2

	var multiplyBy2 = function() {
		console.log(a * 2);
	}
}

//console.log(q)
//multiplyBy2()

function grand() {
	var grand_total = eval("10*20/2")

	console.log(grand_total)
}

function toko(produk, jumlah, harga) {
	var pembeli = {}
	pembeli.produk = produk
	pembeli.jumlah = jumlah
	pembeli.harga = harga
	
	return pembeli
}

var pembeli = toko("Susu", 12, 50000)

function tokoLain(produk, jumlah, harga) {
	this.produk = produk
	this.jumlah = jumlah
	this.harga = harga
}

var pembeli2 = tokoLain("Sayur", 2, 18000)

function tokoBangunan(produk, jumlah, harga) {
	this.produk = produk
	this.jumlah = jumlah
	this.harga = harga
}

tokoBangunan.prototype.stok = function(jumlah) {
	var result = jumlah * this.harga
	return result
}

var pembeli3 = new tokoBangunan("permen", 12, 1000)
var supervisor = new tokoBangunan("permen", 12, 1000)