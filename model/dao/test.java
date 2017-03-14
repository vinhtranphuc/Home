package model.dao;

import java.util.ArrayList;

import model.bean.KhachHang;

public class test {
	public static void main(String[] args) {
		ArrayList<KhachHang> listKhachHang=new ArrayList<KhachHang>();
		HopDongDAO hopDongDAO=new HopDongDAO();
		listKhachHang=hopDongDAO.getListHopDong();
		
		System.out.println(listKhachHang.size());
		
		for(KhachHang khachHang:listKhachHang)
		{
			System.out.println(khachHang.getMaHopDong()+" ");
			System.out.println(khachHang.getTenKhachHang()+" ");
			System.out.println(khachHang.getSoCMND()+" ");
			System.out.println(khachHang.getGioiTinh()+" ");
			System.out.println(khachHang.getDiaChi()+" ");
		}
	}
}
