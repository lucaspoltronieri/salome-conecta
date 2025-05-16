package br.com.salome.conecta.view.cte;

import br.com.salome.conecta.entity.Cte;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "ctes", layout = MainView.class)
@ViewController(id = "Cte.list")
@ViewDescriptor(path = "cte-list-view.xml")
@LookupComponent("ctesDataGrid")
@DialogMode(width = "64em")
public class CteListView extends StandardListView<Cte> {
}