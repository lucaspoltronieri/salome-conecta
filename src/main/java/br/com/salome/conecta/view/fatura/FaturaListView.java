package br.com.salome.conecta.view.fatura;

import br.com.salome.conecta.entity.Fatura;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "faturas", layout = MainView.class)
@ViewController(id = "Fatura.list")
@ViewDescriptor(path = "fatura-list-view.xml")
@LookupComponent("faturasDataGrid")
@DialogMode(width = "64em")
public class FaturaListView extends StandardListView<Fatura> {
}