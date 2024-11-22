// Função para listar as empresas (GET)
function getEmpresas() {
    fetch('http://localhost:8000/api/empresas')
        .then(response => response.json())
        .then(data => {
            console.log('Empresas:', data);
            // Aqui você pode manipular o DOM para mostrar as empresas na página
        })
        .catch(error => console.error('Erro ao buscar empresas:', error));
}

// Função para criar uma nova empresa (POST)
function createEmpresa() {
    const novaEmpresa = {
        cnpj: "33.765.432/0001-99",
        nomeFantasia: "Nova Empresa",
        cep: "98765432",
        endEmpresa: "Rua Nova, 123",
        abertura: "2024-11-20",
        email: "novaempresa@dominio.com",
        razSocial: "Nova Empresa Ltda",
        ie: "987654321",
        tipTransporte: "Rodoviário",
        senhaEmpresa: "senha123"
    };

    fetch('http://localhost:8000/api/empresas', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(novaEmpresa)
    })
    .then(response => response.json())
    .then(data => {
        console.log('Empresa criada:', data);
        // Você pode mostrar uma mensagem de sucesso ou atualizar a lista de empresas
    })
    .catch(error => console.error('Erro ao criar empresa:', error));
}

// Função para atualizar uma empresa (PUT)
function updateEmpresa(empresaId) {
    const empresaAtualizada = {
        nomeFantasia: "Empresa Atualizada",
        cnpj: "33.765.432/0001-99",
        cep: "98765432",
        endEmpresa: "Rua Atualizada, 123",
        abertura: "2024-11-20",
        email: "empresa@atualizada.com",
        razSocial: "Empresa Atualizada Ltda",
        ie: "987654321",
        tipTransporte: "Marítimo",
        senhaEmpresa: "senha456"
    };

    fetch(`http://localhost:8000/api/empresas/${empresaId}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(empresaAtualizada)
    })
    .then(response => response.json())
    .then(data => {
        console.log('Empresa atualizada:', data);
        // Atualizar a página ou mostrar uma mensagem de sucesso
    })
    .catch(error => console.error('Erro ao atualizar empresa:', error));
}

// Função para deletar uma empresa (DELETE)
function deleteEmpresa(empresaId) {
    fetch(`http://localhost:8000/api/empresas/${empresaId}`, {
        method: 'DELETE'
    })
    .then(response => {
        if (response.ok) {
            console.log('Empresa deletada');
            // Atualizar a lista de empresas ou mostrar uma mensagem
        } else {
            console.log('Erro ao deletar empresa');
        }
    })
    .catch(error => console.error('Erro ao deletar empresa:', error));
}
