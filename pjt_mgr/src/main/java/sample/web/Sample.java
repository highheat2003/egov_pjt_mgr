package sample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.service.FavUser;

@RestController
public class Sample {

	@RequestMapping("/getFavUser.do")
	public FavUser getFavUser() {
		FavUser favUser = new FavUser();
		favUser.setUserId("aaaaa");
		favUser.setUserName("홍길동");
		favUser.setUserAge(1111);
		return favUser;
	}

}
