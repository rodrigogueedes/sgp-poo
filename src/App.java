import java.time.LocalDate;

import entidades.Projeto;
import entidades.Tarefa;
import entidades.Usuario;
import enums.Prioridade;
import enums.StatusProjeto;
import enums.StatusTarefa;
import enums.StatusUsuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNome("Rodrigo Guedes Silva");
        usuario.setCpf("123.456.789-00");
        usuario.setEmail("rodrigo1234@gmail.com");
        usuario.setSenha("rodrigo123");
        usuario.setDataNascimento(LocalDate.of(2007, 1, 13));
        usuario.setStatus(StatusUsuario.ATIVO);

        Projeto projeto = new Projeto();
        projeto.setNome("Sistema de Gestão de Projetos (SGP)");
        projeto.setDataInicio(LocalDate.of(2026, 5, 9));
        projeto.setStatus(StatusProjeto.ATIVO);
        projeto.setResponsavel(usuario);

        Tarefa tarefa = new Tarefa();
        tarefa.setId(1L);
        tarefa.setTitulo("Criação das entidades do Sistema");
        tarefa.setDataCriacao(LocalDate.now());
        tarefa.setPrioridade(Prioridade.ALTA);
        tarefa.setStatus(StatusTarefa.CONCLUIDA);
        tarefa.setProjeto(projeto);
        tarefa.setUsuario(usuario);
    }
}
