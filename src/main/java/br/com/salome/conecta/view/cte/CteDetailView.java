package br.com.salome.conecta.view.cte;

import br.com.salome.conecta.entity.Cte;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "ctes/:id", layout = MainView.class)
@ViewController(id = "Cte.detail")
@ViewDescriptor(path = "cte-detail-view.xml")
@EditedEntityContainer("cteDc")
public class CteDetailView extends StandardDetailView<Cte> {
}