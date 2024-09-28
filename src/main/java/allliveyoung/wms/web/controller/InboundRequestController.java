package allliveyoung.wms.web.controller;

import allliveyoung.wms.service.InboundRequestService;
import allliveyoung.wms.web.dto.PageRequestDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/inbound-requests")
@Log4j2
@RequiredArgsConstructor
public class InboundRequestController {

    private final InboundRequestService inboundRequestService;

    @GetMapping()
    public void getInboundRequests(@Validated PageRequestDTO pageRequestDTO, BindingResult bindingResult, Model model) {

    }

    @GetMapping("/{id}")
    public void getInboundRequest(Long id, Model model, PageRequestDTO pageRequestDTO) {

    }

    @GetMapping("/save")
    public void getInboundRequestSaveForm() {

    }

    @PostMapping("/save")
    public void postInboundRequestSaveForm() {

    }

    @PostMapping( "/{id}/delete")
    public void postInboundRequestDelete() {

    }

    @PostMapping("/{id}/update")
    public void postInboundRequestUpdateForm() {

    }

    @PostMapping("/{id}/update-status")
    public void PostRequestUpdateStatus() {

    }


}
