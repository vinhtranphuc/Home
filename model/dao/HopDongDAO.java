package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.KhachHang;

public class HopDongDAO extends DataProvider{
	
	public ArrayList<KhachHang> getListHopDong()
	{
		ArrayList<KhachHang> listHopDong = new ArrayList<KhachHang>();
		KhachHang hopDong;
		String querry="select hd.MaHopDong,kh.TenKhachHang,CMND,case when kh.GioiTinh=1 then N'Nam' else N'Nữ' end as 'GioiTinh',DiaChi  from HopDong as hd,KhachHang as kh where hd.MaKhachHang=kh.MaKhachHang order by MaHopDong";
		try {
			ResultSet rs=exQ(querry);
			while(rs.next())
			{
			hopDong=new KhachHang();
			hopDong.setMaHopDong(rs.getString("MaHopDong"));
			hopDong.setTenKhachHang(rs.getString("TenKhachHang"));
			hopDong.setSoCMND(rs.getString("CMND"));
			hopDong.setGioiTinh(rs.getString("GioiTinh"));
			hopDong.setDiaChi(rs.getString("DiaChi"));
			listHopDong.add(hopDong);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listHopDong;
	}
}