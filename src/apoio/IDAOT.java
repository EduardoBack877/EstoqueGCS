
package apoio;

import java.util.ArrayList;


public interface IDAOT <T> {

    public boolean salvar(T o);

    public boolean atualizar(T o);

    public boolean excluir(int id);

    public ArrayList<T> consultarTodos();

    public ArrayList<T> consultar(String criterio);

    public T consultarId(int id);
}
