package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.KhachHang;
import model.bo.HopDongBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.HopDongForm;

public class HopDongAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HopDongBO hopDongBO=new HopDongBO();
		
		//lấy danh sách hợp đồng
		ArrayList<KhachHang> listHopDong=new ArrayList<KhachHang>();
		listHopDong=hopDongBO.getListHopDong();
		
		for(KhachHang element:listHopDong)
		{
			System.out.println(element.getMaKhachHang());
			System.out.println(element.getMaHopDong());
			System.out.println(element.getGioiTinh());
			System.out.println(element.getSoCMND());
			System.out.println(element.getDiaChi());
		}
		//gửi danh sách hợp đồng
		HopDongForm hopDongForm=new HopDongForm();
		hopDongForm.setListHopDong(listHopDong);
		
		return mapping.findForward("themSinhVien.jsp");
	}
}
