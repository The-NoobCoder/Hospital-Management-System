import { TestBed } from '@angular/core/testing';

import { ReceptionistRegistrationService } from './receptionist-registration.service';

describe('ReceptionistRegistrationService', () => {
  let service: ReceptionistRegistrationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ReceptionistRegistrationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
