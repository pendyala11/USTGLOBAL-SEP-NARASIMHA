import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchbycompamyComponent } from './searchbycompamy.component';

describe('SearchbycompamyComponent', () => {
  let component: SearchbycompamyComponent;
  let fixture: ComponentFixture<SearchbycompamyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchbycompamyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchbycompamyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
