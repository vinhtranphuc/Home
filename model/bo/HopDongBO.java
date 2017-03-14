package model.bo;

import java.util.ArrayList;

import model.bean.KhachHang;
import model.dao.HopDongDAO;

public class HopDongBO {

	public ArrayList<KhachHang> getListHopDong() {
		HopDongDAO hopDongDAO=new HopDongDAO();
		return hopDongDAO.getListHopDong();
	}
}
