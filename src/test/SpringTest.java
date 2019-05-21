package test;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.PaperDao;
import com.demo.entity.Paper;

public class SpringTest extends SpringTestBase{
	@Autowired
	private PaperDao paperDao;
	@Test
	public void findAllById() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int id = 120604;
		Paper paper = paperDao.findAllById(id);
		System.out.println(paper.getTestId());
		System.out.println(paper.getTestName());
		System.out.println(sdf.format(paper.getStartDate()));
		System.out.println(sdf.format(paper.getEndDate()));
	}
}