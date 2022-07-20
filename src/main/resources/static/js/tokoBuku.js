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