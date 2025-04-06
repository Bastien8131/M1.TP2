function autoFillForm() {
    document.getElementById("nomPart").value = "Dupont";
    document.getElementById("prenomPart").value = "Jean";
    document.getElementById("organismePart").value = "Université";
    document.getElementById("cpPart").value = "31000";
    document.getElementById("adrPart").value = "1 Rue de l'Université";
    document.getElementById("villePart").value = "Toulouse";
    document.getElementById("paysPart").value = "France";
    document.getElementById("emailPart").value = "jean.dupont@example.com";
    document.getElementById("dtInscription").value = "2023-10-01";
    document.getElementById("statut").value = "Actif";
    document.getElementById("password").value = "password123";
}

document.addEventListener("DOMContentLoaded", autoFillForm);