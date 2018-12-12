package jsp;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class MyTag extends SimpleTagSupport {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void doTag() throws JspException, IOException {

      JspWriter out= getJspContext().getOut();
                out.print("Hello SimpleTagSupport<br/>");
                out.print(name+"<br/>");
//                out.print("<b>");
//                getJspBody().invoke(null);
//                out.print("</b>");
        getJspContext().setAttribute("one","two ");



        StringWriter stringWriter=new StringWriter();
        getJspBody().invoke(stringWriter);
        out.print("<b>");
        out.print(stringWriter.toString());
                out.print("</b>");


    }
}
