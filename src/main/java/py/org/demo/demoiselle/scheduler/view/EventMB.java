package py.org.demo.demoiselle.scheduler.view;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import py.org.demo.demoiselle.scheduler.business.EventBC;
import py.org.demo.demoiselle.scheduler.domain.Bookmark;
import br.gov.frameworkdemoiselle.annotation.Name;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
@Name(value = "eventMB")
public class EventMB extends AbstractListPageBean<Bookmark, Long> implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5835191527760414088L;

	@Inject
	private EventBC eventBC;

	@Override
	protected List<Bookmark> handleResultList() {
		// TODO Auto-generated method stub
		return null;
	}

	public String setTimer() {
		eventBC.setTimer();
		return null;
	}

}
