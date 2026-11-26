
document.getElementById("PetShop").addEventListener("submit", function(event) {
    event.preventDefault();
    const dados = new FormData();
    dados.append("nome", document.getElementById("nome").value);
    dados.append("tipo", document.getElementById("tipo").value);
    dados.append("raca", document.getElementById("raca").value);
    dados.append("sexo", document.getElementById("sexo").value);
    dados.append("tutorNome", document.getElementById("tutorNome").value);
    dados.append("idade", document.getElementById("idade").value);
    dados.append("foto", document.getElementById("foto").files[0]);

    fetch('http://localhost:8080/petshop/create', {
        method: "POST",
        body: dados
    })

    .then(response => {
        if (!response.ok) {
            throw new Error("Erro ao cadastrar o animal");
        }

        return response.json();
    })

    .then(data => {
        alert("Animal cadastrado com sucesso!");
        document.getElementById("PetShop").reset();
    })

    .catch(error => {
        alert("Erro ao cadastrar: " + error.message);
    });

});
