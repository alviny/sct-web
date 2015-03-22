package com.sct.web.jee;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sct.vo.InvestorVO;
/**
 * This is JEE implementation of REST
 * will be exposed as <code>/jee/investors</code> context.
 * @author alviny
 *
 */
@Path("investors")
public class InvestorController {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<InvestorVO> getInvestors(){
		List<InvestorVO> investors = new ArrayList<InvestorVO>();
		investors.add(new InvestorVO("account1"));
		return investors;
    }
}
