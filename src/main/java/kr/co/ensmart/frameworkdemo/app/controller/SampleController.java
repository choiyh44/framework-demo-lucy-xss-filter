package kr.co.ensmart.frameworkdemo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.ensmart.frameworkdemo.app.dto.Sample;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/sample")
@Slf4j
public class SampleController {

	@GetMapping("")
	public String viewSampleForm() {
		return "sampleForm";
	}

	@PostMapping("")
	public String processSampleForm(@RequestParam String text1, @RequestParam String text2, @RequestParam String noXss_text3,Model model) {
		model.addAttribute("text1", text1);
		model.addAttribute("text2", text2);
		model.addAttribute("noXss_text3", noXss_text3);
		log.info("text1: {}, text2: {}, noXss_text3: {}", text1, text2, noXss_text3);
		return "sampleForm";
	}

	@GetMapping("/form2")
	public String viewSampleForm2() {
		return "sampleForm2";
	}

	@PostMapping("form2")
	public String processSampleForm2(@RequestParam String text1, @RequestParam String text2, @RequestParam String noXss_text3,Model model) {
		model.addAttribute("text1", text1);
		model.addAttribute("text2", text2);
		model.addAttribute("noXss_text3", noXss_text3);
		log.info("text1: {}, text2: {}, noXss_text3: {}", text1, text2, noXss_text3);
		return "sampleForm2";
	}

    @GetMapping("/form3")
    public String viewSampleForm3(Sample sample, Model model) {
        String text1 = sample.getText1();
        String text2 = sample.getText2();
        String noXss_text3 = sample.getNoXssText3();
        model.addAttribute("text1", text1);
        model.addAttribute("text2", text2);
        model.addAttribute("noXss_text3", noXss_text3);
        log.info("text1: {}, text2: {}, noXss_text3: {}", text1, text2, noXss_text3);
        return "sampleForm";
    }

}
