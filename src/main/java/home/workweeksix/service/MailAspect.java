package home.workweeksix.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MailAspect {

  private static final String TO = "";
  private static final String SUBJECT = "Test";
  private static final String TEXT = "Mail testowy";

  private final MailService mailService;

  @Autowired
  public MailAspect(MailService mailService) {
    this.mailService = mailService;
  }


  @After("@annotation(MailInit)")
  private void sendEmail() {
    mailService.sendSimpleMessage(TO, SUBJECT, TEXT);
  }

}
