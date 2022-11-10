import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecordspComponent } from './recordsp.component';

describe('RecordspComponent', () => {
  let component: RecordspComponent;
  let fixture: ComponentFixture<RecordspComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RecordspComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RecordspComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
