package com.xtivia.samples.books.portlet;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.xtivia.samples.books.dao.InMemoryBookDao;
import com.xtivia.samples.books.model.BookManager;

public class BookPortlet extends GenericPortlet {

	private BookManager manager;
	
	@Override
	public void init() {
		manager = new BookManager(new InMemoryBookDao());
	}
	
	@Override
	protected String getTitle(RenderRequest request) {
		return "Book List";
	}

	@ProcessAction(name = "checkout") 
	public void action(RenderRequest request, RenderResponse response) {
		
	}
	
	@RenderMode(name = "view")
	public void renderView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		request.setAttribute("books", manager.allBooks());
		getPortletContext().getRequestDispatcher("/views/list.jsp").include(request, response);
	}

	@RenderMode(name = "edit")
	public void renderEdit(RenderRequest request, RenderResponse response) {
		
	}

	@RenderMode(name = "help")
	public void renderHelp(RenderRequest request, RenderResponse response) {
		
	}
}
