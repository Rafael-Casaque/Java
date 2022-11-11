package Data;

import java.util.List;

import Model.Candidato;

public interface CandidatoDAO extends DAO<Candidato>{
	void  salvar(Candidato candidato);
    void atualizar (Candidato candidato);
    void apagar (Candidato candidato);
    Candidato buscar (int id);
    List<Candidato> buscarTodos();
}
