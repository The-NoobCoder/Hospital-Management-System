import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecordsdComponent } from './recordsd.component';

describe('RecordsdComponent', () => {
  let component: RecordsdComponent;
  let fixture: ComponentFixture<RecordsdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RecordsdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RecordsdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
