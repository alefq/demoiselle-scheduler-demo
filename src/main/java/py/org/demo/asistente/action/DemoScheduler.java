package py.org.demo.asistente.action;

import java.io.Serializable;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.gov.component.demoiselle.scheduler.ISchedulerAction;
import br.gov.component.demoiselle.scheduler.Scheduler;
import br.gov.component.demoiselle.scheduler.SchedulerActionManager;
import br.gov.frameworkdemoiselle.annotation.Name;
import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;

@Scheduler(expression = "16:27:00 EVERY_MINUTE")
@Name(value="demoScheduler")
@BusinessController
public class DemoScheduler implements ISchedulerAction, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7185856082262566555L;
	@Inject
	Logger log;

	@Startup
	public void initialize() {
		SchedulerActionManager scheduler;
		scheduler = new SchedulerActionManager();
		scheduler.execute();
	}

	public void execute() {
		log.debug("Ejecutando tarea programada...");
	}
}