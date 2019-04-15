package com.example.struts.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuAction extends Action {

    public ActionForward friends(ActionMapping mapping, ActionForm form, HttpServletRequest request,
             HttpServletResponse response) throws Exception {
        return mapping.findForward("friends");
    }

    public ActionForward messages(ActionMapping mapping, ActionForm  form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        return mapping.findForward("messages");
    }
}
