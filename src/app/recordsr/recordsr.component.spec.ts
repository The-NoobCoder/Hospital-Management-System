import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecordsrComponent } from './recordsr.component';

describe('RecordsrComponent', () => {
  let component: RecordsrComponent;
  let fixture: ComponentFixture<RecordsrComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RecordsrComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RecordsrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
